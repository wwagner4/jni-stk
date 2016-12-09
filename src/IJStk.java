public interface IJStk {

  public void addGraph(int graphId, JStkNode graph);
  public void removeGraph(int graphId);
  public void setValue(int graphId, int nodeId, int typeOrdinal, double value);
  
  public void shutdown();

}