/**
 */
package ai.vital.flora2.edit.flora2Editor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ai.vital.flora2.edit.flora2Editor.Flora2EditorFactory
 * @model kind="package"
 * @generated
 */
public interface Flora2EditorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "flora2Editor";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.vital.ai/flora2/edit/Flora2Editor";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "flora2Editor";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Flora2EditorPackage eINSTANCE = ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl.init();

  /**
   * The meta object id for the '{@link ai.vital.flora2.edit.flora2Editor.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ai.vital.flora2.edit.flora2Editor.impl.ModelImpl
   * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Exps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__EXPS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ai.vital.flora2.edit.flora2Editor.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ai.vital.flora2.edit.flora2Editor.impl.ExpressionImpl
   * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OP = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ai.vital.flora2.edit.flora2Editor.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ai.vital.flora2.edit.flora2Editor.impl.UnaryExpressionImpl
   * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ai.vital.flora2.edit.flora2Editor.impl.AtomExpressionImpl <em>Atom Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ai.vital.flora2.edit.flora2Editor.impl.AtomExpressionImpl
   * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getAtomExpression()
   * @generated
   */
  int ATOM_EXPRESSION = 3;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_EXPRESSION__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Atom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_EXPRESSION__ATOM = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_EXPRESSION__TERMS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Atom Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ai.vital.flora2.edit.flora2Editor.impl.VariableExpressionImpl <em>Variable Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ai.vital.flora2.edit.flora2Editor.impl.VariableExpressionImpl
   * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getVariableExpression()
   * @generated
   */
  int VARIABLE_EXPRESSION = 4;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXPRESSION__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXPRESSION__NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ai.vital.flora2.edit.flora2Editor.impl.StringExpressionImpl <em>String Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ai.vital.flora2.edit.flora2Editor.impl.StringExpressionImpl
   * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getStringExpression()
   * @generated
   */
  int STRING_EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPRESSION__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ai.vital.flora2.edit.flora2Editor.impl.NumberExpressionImpl <em>Number Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ai.vital.flora2.edit.flora2Editor.impl.NumberExpressionImpl
   * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getNumberExpression()
   * @generated
   */
  int NUMBER_EXPRESSION = 6;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_EXPRESSION__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ai.vital.flora2.edit.flora2Editor.impl.ListExpressionImpl <em>List Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ai.vital.flora2.edit.flora2Editor.impl.ListExpressionImpl
   * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getListExpression()
   * @generated
   */
  int LIST_EXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_EXPRESSION__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_EXPRESSION__HEAD = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_EXPRESSION__TAIL = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>List Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link ai.vital.flora2.edit.flora2Editor.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link ai.vital.flora2.edit.flora2Editor.Model#getExps <em>Exps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exps</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.Model#getExps()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Exps();

  /**
   * Returns the meta object for class '{@link ai.vital.flora2.edit.flora2Editor.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link ai.vital.flora2.edit.flora2Editor.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link ai.vital.flora2.edit.flora2Editor.Expression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.Expression#getOp()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link ai.vital.flora2.edit.flora2Editor.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for class '{@link ai.vital.flora2.edit.flora2Editor.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for class '{@link ai.vital.flora2.edit.flora2Editor.AtomExpression <em>Atom Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom Expression</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.AtomExpression
   * @generated
   */
  EClass getAtomExpression();

  /**
   * Returns the meta object for the attribute '{@link ai.vital.flora2.edit.flora2Editor.AtomExpression#getAtom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Atom</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.AtomExpression#getAtom()
   * @see #getAtomExpression()
   * @generated
   */
  EAttribute getAtomExpression_Atom();

  /**
   * Returns the meta object for the containment reference '{@link ai.vital.flora2.edit.flora2Editor.AtomExpression#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Terms</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.AtomExpression#getTerms()
   * @see #getAtomExpression()
   * @generated
   */
  EReference getAtomExpression_Terms();

  /**
   * Returns the meta object for class '{@link ai.vital.flora2.edit.flora2Editor.VariableExpression <em>Variable Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Expression</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.VariableExpression
   * @generated
   */
  EClass getVariableExpression();

  /**
   * Returns the meta object for the attribute '{@link ai.vital.flora2.edit.flora2Editor.VariableExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.VariableExpression#getName()
   * @see #getVariableExpression()
   * @generated
   */
  EAttribute getVariableExpression_Name();

  /**
   * Returns the meta object for class '{@link ai.vital.flora2.edit.flora2Editor.StringExpression <em>String Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Expression</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.StringExpression
   * @generated
   */
  EClass getStringExpression();

  /**
   * Returns the meta object for the attribute '{@link ai.vital.flora2.edit.flora2Editor.StringExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.StringExpression#getValue()
   * @see #getStringExpression()
   * @generated
   */
  EAttribute getStringExpression_Value();

  /**
   * Returns the meta object for class '{@link ai.vital.flora2.edit.flora2Editor.NumberExpression <em>Number Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Expression</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.NumberExpression
   * @generated
   */
  EClass getNumberExpression();

  /**
   * Returns the meta object for the attribute '{@link ai.vital.flora2.edit.flora2Editor.NumberExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.NumberExpression#getValue()
   * @see #getNumberExpression()
   * @generated
   */
  EAttribute getNumberExpression_Value();

  /**
   * Returns the meta object for class '{@link ai.vital.flora2.edit.flora2Editor.ListExpression <em>List Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Expression</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.ListExpression
   * @generated
   */
  EClass getListExpression();

  /**
   * Returns the meta object for the containment reference '{@link ai.vital.flora2.edit.flora2Editor.ListExpression#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.ListExpression#getHead()
   * @see #getListExpression()
   * @generated
   */
  EReference getListExpression_Head();

  /**
   * Returns the meta object for the containment reference '{@link ai.vital.flora2.edit.flora2Editor.ListExpression#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see ai.vital.flora2.edit.flora2Editor.ListExpression#getTail()
   * @see #getListExpression()
   * @generated
   */
  EReference getListExpression_Tail();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Flora2EditorFactory getFlora2EditorFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ai.vital.flora2.edit.flora2Editor.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ai.vital.flora2.edit.flora2Editor.impl.ModelImpl
     * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Exps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__EXPS = eINSTANCE.getModel_Exps();

    /**
     * The meta object literal for the '{@link ai.vital.flora2.edit.flora2Editor.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ai.vital.flora2.edit.flora2Editor.impl.ExpressionImpl
     * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OP = eINSTANCE.getExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '{@link ai.vital.flora2.edit.flora2Editor.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ai.vital.flora2.edit.flora2Editor.impl.UnaryExpressionImpl
     * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getUnaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

    /**
     * The meta object literal for the '{@link ai.vital.flora2.edit.flora2Editor.impl.AtomExpressionImpl <em>Atom Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ai.vital.flora2.edit.flora2Editor.impl.AtomExpressionImpl
     * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getAtomExpression()
     * @generated
     */
    EClass ATOM_EXPRESSION = eINSTANCE.getAtomExpression();

    /**
     * The meta object literal for the '<em><b>Atom</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOM_EXPRESSION__ATOM = eINSTANCE.getAtomExpression_Atom();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOM_EXPRESSION__TERMS = eINSTANCE.getAtomExpression_Terms();

    /**
     * The meta object literal for the '{@link ai.vital.flora2.edit.flora2Editor.impl.VariableExpressionImpl <em>Variable Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ai.vital.flora2.edit.flora2Editor.impl.VariableExpressionImpl
     * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getVariableExpression()
     * @generated
     */
    EClass VARIABLE_EXPRESSION = eINSTANCE.getVariableExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_EXPRESSION__NAME = eINSTANCE.getVariableExpression_Name();

    /**
     * The meta object literal for the '{@link ai.vital.flora2.edit.flora2Editor.impl.StringExpressionImpl <em>String Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ai.vital.flora2.edit.flora2Editor.impl.StringExpressionImpl
     * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getStringExpression()
     * @generated
     */
    EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_EXPRESSION__VALUE = eINSTANCE.getStringExpression_Value();

    /**
     * The meta object literal for the '{@link ai.vital.flora2.edit.flora2Editor.impl.NumberExpressionImpl <em>Number Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ai.vital.flora2.edit.flora2Editor.impl.NumberExpressionImpl
     * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getNumberExpression()
     * @generated
     */
    EClass NUMBER_EXPRESSION = eINSTANCE.getNumberExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_EXPRESSION__VALUE = eINSTANCE.getNumberExpression_Value();

    /**
     * The meta object literal for the '{@link ai.vital.flora2.edit.flora2Editor.impl.ListExpressionImpl <em>List Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ai.vital.flora2.edit.flora2Editor.impl.ListExpressionImpl
     * @see ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorPackageImpl#getListExpression()
     * @generated
     */
    EClass LIST_EXPRESSION = eINSTANCE.getListExpression();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_EXPRESSION__HEAD = eINSTANCE.getListExpression_Head();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_EXPRESSION__TAIL = eINSTANCE.getListExpression_Tail();

  }

} //Flora2EditorPackage
