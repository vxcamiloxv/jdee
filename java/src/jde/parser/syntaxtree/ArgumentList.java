//
// Generated by JTB 1.1.2
//

package jde.parser.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * f0 -> Expression()
 * f1 -> ( "," Expression() )*
 * </PRE>
 */
public class ArgumentList implements Node {
   public Expression f0;
   public NodeListOptional f1;

   public ArgumentList(Expression n0, NodeListOptional n1) {
      f0 = n0;
      f1 = n1;
   }

   public void accept(jde.parser.visitor.Visitor v) {
      v.visit(this);
   }
}
