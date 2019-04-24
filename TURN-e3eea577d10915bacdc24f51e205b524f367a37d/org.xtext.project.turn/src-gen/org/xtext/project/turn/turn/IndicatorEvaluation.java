/**
 * generated by Xtext 2.14.0
 */
package org.xtext.project.turn.turn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indicator Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.IndicatorEvaluation#getRealWorldLabel <em>Real World Label</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.IndicatorEvaluation#getRealWorldValue <em>Real World Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.turn.turn.TurnPackage#getIndicatorEvaluation()
 * @model
 * @generated
 */
public interface IndicatorEvaluation extends EObject
{
  /**
   * Returns the value of the '<em><b>Real World Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Real World Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Real World Label</em>' attribute.
   * @see #setRealWorldLabel(String)
   * @see org.xtext.project.turn.turn.TurnPackage#getIndicatorEvaluation_RealWorldLabel()
   * @model
   * @generated
   */
  String getRealWorldLabel();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.IndicatorEvaluation#getRealWorldLabel <em>Real World Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Real World Label</em>' attribute.
   * @see #getRealWorldLabel()
   * @generated
   */
  void setRealWorldLabel(String value);

  /**
   * Returns the value of the '<em><b>Real World Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Real World Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Real World Value</em>' attribute.
   * @see #setRealWorldValue(int)
   * @see org.xtext.project.turn.turn.TurnPackage#getIndicatorEvaluation_RealWorldValue()
   * @model
   * @generated
   */
  int getRealWorldValue();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.IndicatorEvaluation#getRealWorldValue <em>Real World Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Real World Value</em>' attribute.
   * @see #getRealWorldValue()
   * @generated
   */
  void setRealWorldValue(int value);

} // IndicatorEvaluation
