/* Generated By:JJTree: Do not edit this line. Node.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
 package ur_rna.GUITester.ScriptParser;

/* All AST nodes must implement this interface.  It provides basic
   machinery for constructing the parent and child relationships
   between nodes. */

public
interface Node {

  /** This method is called after the node has been made the current
    node.  It indicates that child nodes can now be added to it. */
  void jjtOpen();

  /** This method is called after all the child nodes have been
    added. */
  void jjtClose();

  /** This pair of methods are used to inform the node of its
    parent. */
  void jjtSetParent(Node n);
  Node jjtGetParent();

  /** This method tells the node to add its argument to the node's
    list of children.  */
  void jjtAddChild(Node n, int i);

  /** This method returns a child node.  The children are numbered
     from zero, left to right. */
  Node jjtGetChild(int i);

  /** Return the number of children the node has. */
  int jjtGetNumChildren();

  int getId();
}
/* JavaCC - OriginalChecksum=5abfeabfa8b1028032e2a12e0fdcbcb6 (do not edit this line) */
