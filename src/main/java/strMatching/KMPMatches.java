package strMatching;

/**
 *
 * @Author jingtao
 * @Date 2017-08-21 9:42
 **/
public class KMPMatches {

    /**
     * kmp算法的核心思想:
     *  为了避免, 在简单字符串匹配算法中, 多余的比较.(每次只会向下移动一位, 而新字符串, 其实, 有很大的可能, 已经匹配过)
     *  因此, 出现了KMP算法.
     *
     *  KMP算法的核心是, next数组, 也叫next函数, 他决定了, 该位移多少位, 而不是固定的一位.
     *
     *  next数值 = 已匹配的字符串长度 - 对应的next数值
     *
     */
    public static void main(String[] args) {

//        for(int a: getNextArr("abcba")) {
//            System.out.print(a + ", ");
//        }

        System.out.println(kmpMatch("aeabcba", "abcb"));
    }


    /**
     *
     * 在target串中, 进行匹配pattern字符串,
     * 如果找到, 则返回对应的索引,
     * 如果没有找到, 则返回null
     */
    public static Integer kmpMatch(String target, String pattern) {

        // 获得next数组
        int[] next = getNextArr(pattern);

        // 循环, 进行匹配, 直到target.length() - pattern.length(),
        // 并且, 步长是, 根据next数组计算出来的
        for(int i = 0; i <= target.length() - pattern.length();) {

            // 已匹配的子字符串长度
            int matchNum = 0;

            // 循环, 字符串中的字符, 进行比较
            for(int j = 0; j < pattern.length(); j ++) {

                // 没有匹配的字符串, 让 i + 1, 继续向下匹配
                if(j == 0 && target.charAt(i + j) != pattern.charAt(j)) {
                    i = i + 1;
                    break;
                }

                // 有匹配的字符串, 根据next数组, 跳过指定的位移
                if(target.charAt(i + j) != pattern.charAt(j)){

                    // 位移 = 已匹配的字符串长度 - 对应的next数值
                    i = matchNum - next[j - 1] + i;
                    break;
                }

                matchNum ++;
            }

            // 如果匹配, 则直接返回, 索引
            if(matchNum == pattern.length()) {
                return i;
            }
        }

        return null;
    }


    /**
     *
     *  获得一个数组的, next数组
     */
    public static int[] getNextArr(String pattern) {
        int[] next = new int[pattern.length()];

        // 循环为, next数组中的每个元素, 进行赋值.
        for(int i = 0; i < next.length; i ++) {

            // 第一个元素, 前缀和后缀为空集, 部分匹配值为0
            if(i == 0) {
                next[0] = 0;
            }

            // 其他元素, 则从最长的子串, 进行匹配
            // 匹配到, 则直接返回, 因为是从最长开始匹配的, 此时,就是最大的共有字符串.
            else {

                // 最大前缀, 从0到, 倒数第一个元素
                // 最大后缀, 从1到, 最后一个元素
                for (int maxPre = i - 1, maxSuf = 1; maxPre >= 0 && maxSuf <= i; maxPre--, maxSuf++) {

                    // 由于substring方法, 左闭右开, 因此需要+1
                    if(pattern.substring(0, maxPre + 1).equals(pattern.substring(maxSuf, i + 1))) {

                        // 部分匹配值为, 最大共有字符串的长度
                        next[i] = maxPre + 1;
                        break;
                    }
                }
            }
        }

        return next;
    }
}
