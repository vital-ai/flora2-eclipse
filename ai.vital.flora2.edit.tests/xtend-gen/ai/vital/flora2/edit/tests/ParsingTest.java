package ai.vital.flora2.edit.tests;

import ai.vital.flora2.edit.Flora2EditorInjectorProvider;
import ai.vital.flora2.edit.flora2Editor.Expression;
import ai.vital.flora2.edit.flora2Editor.Model;
import ai.vital.flora2.edit.flora2Editor.NumberExpression;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(Flora2EditorInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ParsingTest {
  @Inject
  private ParseHelper<Model> parser;
  
  @Test
  public void parseDomainmodel() {
    try {
      final Model model = this.parser.parse("1234");
      EList<Expression> _exps = model.getExps();
      Expression _get = _exps.get(0);
      final Expression entity = ((Expression) _get);
      Expression _right = entity.getRight();
      Expression _right_1 = _right.getRight();
      Expression _right_2 = _right_1.getRight();
      Expression _right_3 = _right_2.getRight();
      Expression _right_4 = _right_3.getRight();
      final NumberExpression num = ((NumberExpression) _right_4);
      String _value = num.getValue();
      String _plus = ("Num: " + _value);
      InputOutput.<String>println(_plus);
      String _value_1 = num.getValue();
      Assert.assertEquals(_value_1, "1234");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
