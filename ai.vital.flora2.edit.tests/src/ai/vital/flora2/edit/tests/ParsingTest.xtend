package ai.vital.flora2.edit.tests


import org.eclipse.xtext.junit4.util.ParseHelper
import static org.junit.Assert.*
import org.eclipse.xtext.junit4.InjectWith
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import ai.vital.flora2.edit.Flora2EditorInjectorProvider
import com.google.inject.Inject
import org.junit.Test
import ai.vital.flora2.edit.flora2Editor.NumberExpression
import ai.vital.flora2.edit.flora2Editor.Model
import ai.vital.flora2.edit.flora2Editor.UnaryExpression
import ai.vital.flora2.edit.flora2Editor.AtomExpression
import ai.vital.flora2.edit.flora2Editor.Expression

@InjectWith(Flora2EditorInjectorProvider)
@RunWith(XtextRunner)
class ParsingTest {
	

	@Inject
	ParseHelper<Model> parser
	
	@Test
	def void parseDomainmodel() {
	
	val model = parser.parse("1234")
	
	val entity = model.getExps().get(0) as Expression
	
	val num = entity.getRight().getRight().getRight().getRight().getRight() as NumberExpression
	
	println ("Num: " + num.getValue() )
		
	// assertSame( entity.getValue(), 1234)
	
	assertEquals( num.getValue(), "1234")

}
	
	
}