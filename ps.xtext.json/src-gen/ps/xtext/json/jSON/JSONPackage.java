/**
 * generated by Xtext 2.12.0
 */
package ps.xtext.json.jSON;

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
 * @see ps.xtext.json.jSON.JSONFactory
 * @model kind="package"
 * @generated
 */
public interface JSONPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jSON";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.ps/json/JSON";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jSON";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JSONPackage eINSTANCE = ps.xtext.json.jSON.impl.JSONPackageImpl.init();

  /**
   * The meta object id for the '{@link ps.xtext.json.jSON.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ps.xtext.json.jSON.impl.ValueImpl
   * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getValue()
   * @generated
   */
  int VALUE = 0;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ps.xtext.json.jSON.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ps.xtext.json.jSON.impl.ObjectImpl
   * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 1;

  /**
   * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__PAIRS = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ps.xtext.json.jSON.impl.PairImpl <em>Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ps.xtext.json.jSON.impl.PairImpl
   * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getPair()
   * @generated
   */
  int PAIR = 2;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__STRING = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ps.xtext.json.jSON.impl.ArrayImpl <em>Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ps.xtext.json.jSON.impl.ArrayImpl
   * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getArray()
   * @generated
   */
  int ARRAY = 3;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__VALUES = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ps.xtext.json.jSON.impl.NumberImpl <em>Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ps.xtext.json.jSON.impl.NumberImpl
   * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getNumber()
   * @generated
   */
  int NUMBER = 4;

  /**
   * The number of structural features of the '<em>Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ps.xtext.json.jSON.impl.StrImpl <em>Str</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ps.xtext.json.jSON.impl.StrImpl
   * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getStr()
   * @generated
   */
  int STR = 5;

  /**
   * The number of structural features of the '<em>Str</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ps.xtext.json.jSON.impl.BooleanImpl <em>Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ps.xtext.json.jSON.impl.BooleanImpl
   * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getBoolean()
   * @generated
   */
  int BOOLEAN = 6;

  /**
   * The number of structural features of the '<em>Boolean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ps.xtext.json.jSON.impl.NullImpl <em>Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ps.xtext.json.jSON.impl.NullImpl
   * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getNull()
   * @generated
   */
  int NULL = 7;

  /**
   * The number of structural features of the '<em>Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ps.xtext.json.jSON.impl.TrueImpl <em>True</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ps.xtext.json.jSON.impl.TrueImpl
   * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getTrue()
   * @generated
   */
  int TRUE = 8;

  /**
   * The number of structural features of the '<em>True</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUE_FEATURE_COUNT = BOOLEAN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ps.xtext.json.jSON.impl.FalseImpl <em>False</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ps.xtext.json.jSON.impl.FalseImpl
   * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getFalse()
   * @generated
   */
  int FALSE = 9;

  /**
   * The number of structural features of the '<em>False</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALSE_FEATURE_COUNT = BOOLEAN_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link ps.xtext.json.jSON.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see ps.xtext.json.jSON.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link ps.xtext.json.jSON.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see ps.xtext.json.jSON.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the containment reference list '{@link ps.xtext.json.jSON.Object#getPairs <em>Pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pairs</em>'.
   * @see ps.xtext.json.jSON.Object#getPairs()
   * @see #getObject()
   * @generated
   */
  EReference getObject_Pairs();

  /**
   * Returns the meta object for class '{@link ps.xtext.json.jSON.Pair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pair</em>'.
   * @see ps.xtext.json.jSON.Pair
   * @generated
   */
  EClass getPair();

  /**
   * Returns the meta object for the attribute '{@link ps.xtext.json.jSON.Pair#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see ps.xtext.json.jSON.Pair#getString()
   * @see #getPair()
   * @generated
   */
  EAttribute getPair_String();

  /**
   * Returns the meta object for the containment reference '{@link ps.xtext.json.jSON.Pair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see ps.xtext.json.jSON.Pair#getValue()
   * @see #getPair()
   * @generated
   */
  EReference getPair_Value();

  /**
   * Returns the meta object for class '{@link ps.xtext.json.jSON.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array</em>'.
   * @see ps.xtext.json.jSON.Array
   * @generated
   */
  EClass getArray();

  /**
   * Returns the meta object for the containment reference list '{@link ps.xtext.json.jSON.Array#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see ps.xtext.json.jSON.Array#getValues()
   * @see #getArray()
   * @generated
   */
  EReference getArray_Values();

  /**
   * Returns the meta object for class '{@link ps.xtext.json.jSON.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number</em>'.
   * @see ps.xtext.json.jSON.Number
   * @generated
   */
  EClass getNumber();

  /**
   * Returns the meta object for class '{@link ps.xtext.json.jSON.Str <em>Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Str</em>'.
   * @see ps.xtext.json.jSON.Str
   * @generated
   */
  EClass getStr();

  /**
   * Returns the meta object for class '{@link ps.xtext.json.jSON.Boolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean</em>'.
   * @see ps.xtext.json.jSON.Boolean
   * @generated
   */
  EClass getBoolean();

  /**
   * Returns the meta object for class '{@link ps.xtext.json.jSON.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null</em>'.
   * @see ps.xtext.json.jSON.Null
   * @generated
   */
  EClass getNull();

  /**
   * Returns the meta object for class '{@link ps.xtext.json.jSON.True <em>True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>True</em>'.
   * @see ps.xtext.json.jSON.True
   * @generated
   */
  EClass getTrue();

  /**
   * Returns the meta object for class '{@link ps.xtext.json.jSON.False <em>False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>False</em>'.
   * @see ps.xtext.json.jSON.False
   * @generated
   */
  EClass getFalse();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JSONFactory getJSONFactory();

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
     * The meta object literal for the '{@link ps.xtext.json.jSON.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ps.xtext.json.jSON.impl.ValueImpl
     * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link ps.xtext.json.jSON.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ps.xtext.json.jSON.impl.ObjectImpl
     * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__PAIRS = eINSTANCE.getObject_Pairs();

    /**
     * The meta object literal for the '{@link ps.xtext.json.jSON.impl.PairImpl <em>Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ps.xtext.json.jSON.impl.PairImpl
     * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getPair()
     * @generated
     */
    EClass PAIR = eINSTANCE.getPair();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAIR__STRING = eINSTANCE.getPair_String();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAIR__VALUE = eINSTANCE.getPair_Value();

    /**
     * The meta object literal for the '{@link ps.xtext.json.jSON.impl.ArrayImpl <em>Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ps.xtext.json.jSON.impl.ArrayImpl
     * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getArray()
     * @generated
     */
    EClass ARRAY = eINSTANCE.getArray();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY__VALUES = eINSTANCE.getArray_Values();

    /**
     * The meta object literal for the '{@link ps.xtext.json.jSON.impl.NumberImpl <em>Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ps.xtext.json.jSON.impl.NumberImpl
     * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getNumber()
     * @generated
     */
    EClass NUMBER = eINSTANCE.getNumber();

    /**
     * The meta object literal for the '{@link ps.xtext.json.jSON.impl.StrImpl <em>Str</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ps.xtext.json.jSON.impl.StrImpl
     * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getStr()
     * @generated
     */
    EClass STR = eINSTANCE.getStr();

    /**
     * The meta object literal for the '{@link ps.xtext.json.jSON.impl.BooleanImpl <em>Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ps.xtext.json.jSON.impl.BooleanImpl
     * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getBoolean()
     * @generated
     */
    EClass BOOLEAN = eINSTANCE.getBoolean();

    /**
     * The meta object literal for the '{@link ps.xtext.json.jSON.impl.NullImpl <em>Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ps.xtext.json.jSON.impl.NullImpl
     * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getNull()
     * @generated
     */
    EClass NULL = eINSTANCE.getNull();

    /**
     * The meta object literal for the '{@link ps.xtext.json.jSON.impl.TrueImpl <em>True</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ps.xtext.json.jSON.impl.TrueImpl
     * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getTrue()
     * @generated
     */
    EClass TRUE = eINSTANCE.getTrue();

    /**
     * The meta object literal for the '{@link ps.xtext.json.jSON.impl.FalseImpl <em>False</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ps.xtext.json.jSON.impl.FalseImpl
     * @see ps.xtext.json.jSON.impl.JSONPackageImpl#getFalse()
     * @generated
     */
    EClass FALSE = eINSTANCE.getFalse();

  }

} //JSONPackage