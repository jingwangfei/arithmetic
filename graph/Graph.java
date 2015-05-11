package com.arithmetic.graph;

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
	 * 访问顶点
	 */
	public void visitVertex(Integer vertexIndex) {

		System.out.println(vertexs[vertexIndex].getData());
		vertexs[vertexIndex].setHasVisited(true);
		stack.push(vertexIndex);
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