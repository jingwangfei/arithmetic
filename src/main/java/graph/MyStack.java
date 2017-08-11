package graph;

public class MyStack {

	/**
	 * 自定义栈
	 */
	private Integer[] elementDatas; // 元素数组

	public static final Integer MAX_SIZE = 20; // 最大大小

	private Integer top; // 最后一个有效数据的指针

	/*
	 * 初始化
	 */
	public MyStack() {
		
		elementDatas = new Integer[MAX_SIZE];
		top = -1;
	}
	
	/*
	 * 添加元素
	 */
	public void push(Integer data) {
		if(top == MAX_SIZE - 1) {
			return ;
		}
		
		elementDatas[++top] = data;
	}
	
	/*
	 * 获得元素
	 */
	public Integer peek() {
		
		return elementDatas[top];
	}

	/*
	 * 删除元素
	 */
	public Integer pop() {
		if (top == -1) {
			return null;
		}
		
		Integer retValue = elementDatas[top];
		elementDatas[top--] = null;
		return retValue;
	}
	
	/*
	 * 判断是否是空战
	 */
	public boolean isEmpty() {
		
		return top == -1;
	}
	
	public Integer[] getData() {
		return elementDatas;
	}

	public void setData(Integer[] data) {
		this.elementDatas = data;
	}

	public Integer getTop() {
		return top;
	}

	public void setTop(Integer top) {
		this.top = top;
	}
}
