/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.project.turn.turn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.LinearConversion#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.LinearConversion#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.LinearConversion#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.LinearConversion#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.LinearConversion#getThresholdValue <em>Threshold Value</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.LinearConversion#getWorstValue <em>Worst Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.turn.turn.TurnPackage#getLinearConversion()
 * @model
 * @generated
 */
public interface LinearConversion extends URNmodelElement, IndicatorConversion
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.project.turn.turn.TurnPackage#getLinearConversion_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.LinearConversion#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Long Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Long Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Long Name</em>' containment reference.
   * @see #setLongName(LongName)
   * @see org.xtext.project.turn.turn.TurnPackage#getLinearConversion_LongName()
   * @model containment="true"
   * @generated
   */
  LongName getLongName();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.LinearConversion#getLongName <em>Long Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long Name</em>' containment reference.
   * @see #getLongName()
   * @generated
   */
  void setLongName(LongName value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see #setUnit(String)
   * @see org.xtext.project.turn.turn.TurnPackage#getLinearConversion_Unit()
   * @model
   * @generated
   */
  String getUnit();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.LinearConversion#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see #getUnit()
   * @generated
   */
  void setUnit(String value);

  /**
   * Returns the value of the '<em><b>Target Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Value</em>' attribute.
   * @see #setTargetValue(int)
   * @see org.xtext.project.turn.turn.TurnPackage#getLinearConversion_TargetValue()
   * @model
   * @generated
   */
  int getTargetValue();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.LinearConversion#getTargetValue <em>Target Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Value</em>' attribute.
   * @see #getTargetValue()
   * @generated
   */
  void setTargetValue(int value);

  /**
   * Returns the value of the '<em><b>Threshold Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Threshold Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Threshold Value</em>' attribute.
   * @see #setThresholdValue(int)
   * @see org.xtext.project.turn.turn.TurnPackage#getLinearConversion_ThresholdValue()
   * @model
   * @generated
   */
  int getThresholdValue();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.LinearConversion#getThresholdValue <em>Threshold Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Threshold Value</em>' attribute.
   * @see #getThresholdValue()
   * @generated
   */
  void setThresholdValue(int value);

  /**
   * Returns the value of the '<em><b>Worst Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Worst Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Worst Value</em>' attribute.
   * @see #setWorstValue(int)
   * @see org.xtext.project.turn.turn.TurnPackage#getLinearConversion_WorstValue()
   * @model
   * @generated
   */
  int getWorstValue();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.LinearConversion#getWorstValue <em>Worst Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Worst Value</em>' attribute.
   * @see #getWorstValue()
   * @generated
   */
  void setWorstValue(int value);

} // LinearConversion
