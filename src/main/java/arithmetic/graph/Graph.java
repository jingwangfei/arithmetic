package arithmetic.graph;

public class Graph {

    /**
     * 顶点列表
     */
    private Vertex[] vertexs;

    /**
     * 边列表
     */
    private Integer[][] edges;

    /**
     * 深度优先搜索使用的栈
     */
    private MyStack stack;

    /**
     * 元素个数
     */
    private Integer vertexNum;

    /**
     * 广度优先搜索使用的队列
     */
    private MyQueue<Integer> queue;

    /*
     * 初始化
     */
    public Graph() {

        vertexs = new Vertex[MyStack.MAX_SIZE];

        edges = new Integer[MyStack.MAX_SIZE][MyStack.MAX_SIZE];
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                edges[i][j] = 0;
            }
        }

        stack = new MyStack();
        vertexNum = 0;
        queue = new MyQueue<Integer>();
    }

    /*
     * 深度优先搜索
     */
    public void dfs() {

        Integer p = 0;

        while (p != null || (!stack.isEmpty())) {
            if (p == null) {
                stack.pop();
                if(!stack.isEmpty()) {
                    p = getAdjacentUnvisitedVertex(stack.peek());
                }
            } else {
                visitVertex(p);
                p = getAdjacentUnvisitedVertex(p);
            }
        }
    }

    /*
     * 广度优先搜索
     */
    public void bfs() {

        Integer p = 0;
        Integer temp = null;

        visitVertexQueue(0);

        while (!queue.isEmpty()) {

            temp = queue.poll();

            while(null != (
                    p = getAdjacentUnvisitedVertex(temp))) {
                visitVertexQueue(p);
            }
        }
    }

    /*
     * 访问顶点, 并放入到栈中
     */
    public void visitVertex(Integer vertexIndex) {

        System.out.println(vertexs[vertexIndex].getData());
        vertexs[vertexIndex].setHasVisited(true);
        stack.push(vertexIndex);
    }

    /*
     * 访问顶点, 并放入到队列中
     */
    public void visitVertexQueue(Integer vertexIndex) {

        System.out.println(vertexs[vertexIndex].getData());
        vertexs[vertexIndex].setHasVisited(true);
        queue.add(vertexIndex);
    }



    /*
     * 获得相邻, 未访问的顶点
     */
    public Integer getAdjacentUnvisitedVertex(Integer vertexIndex) {

        for (int i = 0; i < vertexNum; i++) {
            if (edges[vertexIndex][i] == 1 && (!vertexs[i].isHasVisited())) {
                return i;
            }
        }

        return null;
    }

    /*
     * 添加顶点
     */
    public void addVertex(Vertex vertex) {

        vertexs[vertexNum++] = vertex;
    }

    /*
     * 添加边
     */
    public void addEdge(Integer from, Integer to) {

        edges[from][to] = 1;
        edges[to][from] = 1;
    }

    public Vertex[] getVertexs() {
        return vertexs;
    }

    public void setVertexs(Vertex[] vertexs) {
        this.vertexs = vertexs;
    }

    public Integer[][] getEdges() {
        return edges;
    }

    public void setEdges(Integer[][] edges) {
        this.edges = edges;
    }

    public MyStack getStack() {
        return stack;
    }

    public void setStack(MyStack stack) {
        this.stack = stack;
    }
}
