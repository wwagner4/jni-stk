public interface IJStk {

	public void start();

	public void stop();

	public void addGraph(int graphId, JStkNode graph);

	public void removeGraph(int graphId);

	public void setValue(int graphId, int nodeId, int valueTypeOrdinal, double value);

}