package redscript.compiler.ast

import org.objectweb.asm.commons.GeneratorAdapter

class NodeMap(val items: List[NodeMapItem]) extends AST
{
    override def assemble(generator: GeneratorAdapter): Unit = ()
}

class NodeMapItem(val key: NodeExpr, val value: NodeExpr) extends AST
{
    override def assemble(generator: GeneratorAdapter): Unit = ()
}
