package graph;

/**
 * 深度优先搜索 和 广度优先搜索
 */
public class DFSandBFS {

	/*
	 * 		1
	 * 	2		5
	 *3   4
	 */
    public static void testDFS() throws Exception {
        // 创建图
        Vertex vertex1 = new Vertex();
        vertex1.setData(1);

        Vertex vertex2 = new Vertex();
        vertex2.setData(2);

        Vertex vertex3 = new Vertex();
        vertex3.setData(3);

        Vertex vertex4 = new Vertex();
        vertex4.setData(4);

        Vertex vertex5 = new Vertex();
        vertex5.setData(5);

        Graph graph = new Graph();

        graph.addVertex(vertex1);
        graph.addVertex(vertex2);
        graph.addVertex(vertex3);
        graph.addVertex(vertex4);
        graph.addVertex(vertex5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(0, 4);
        graph.addEdge(1, 4);
        graph.addEdge(1, 3);

        // 深度
        graph.dfs();

    }

    /*
     * 		1
     * 	2		5
     *3   4
     */
    public static void testBFS() throws Exception {

        // 创建图
        Vertex vertex1 = new Vertex();
        vertex1.setData(1);

        Vertex vertex2 = new Vertex();
        vertex2.setData(2);

        Vertex vertex3 = new Vertex();
        vertex3.setData(3);

        Vertex vertex4 = new Vertex();
        vertex4.setData(4);

        Vertex vertex5 = new Vertex();
        vertex5.setData(5);

        Graph graph = new Graph();

        graph.addVertex(vertex1);
        graph.addVertex(vertex2);
        graph.addVertex(vertex3);
        graph.addVertex(vertex4);
        graph.addVertex(vertex5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(0, 4);
        graph.addEdge(1, 4);
        graph.addEdge(1, 3);

        // 广度
        graph.bfs();
    }

    public static void main(String[] args) throws Exception {
        testDFS();
    }
}
