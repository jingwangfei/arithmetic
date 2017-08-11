package graph;


public class Vertex {

	/**
	 * 顶点数据
	 */
	private Integer data;

	/**
	 * 是否已经访问
	 */
	private boolean hasVisited; 

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public boolean isHasVisited() {
		return hasVisited;
	}

	public void setHasVisited(boolean hasVisited) {
		this.hasVisited = hasVisited;
	}
}
