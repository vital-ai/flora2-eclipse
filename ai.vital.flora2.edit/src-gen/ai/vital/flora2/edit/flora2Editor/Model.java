/**
 */
package ai.vital.flora2.edit.flora2Editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ai.vital.flora2.edit.flora2Editor.Model#getExps <em>Exps</em>}</li>
 * </ul>
 *
 * @see ai.vital.flora2.edit.flora2Editor.Flora2EditorPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Exps</b></em>' containment reference list.
   * The list contents are of type {@link ai.vital.flora2.edit.flora2Editor.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exps</em>' containment reference list.
   * @see ai.vital.flora2.edit.flora2Editor.Flora2EditorPackage#getModel_Exps()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExps();

} // Model
