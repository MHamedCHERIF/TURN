/**
 * generated by Xtext 2.14.0
 */
package org.xtext.project.turn.turn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.Stub#getStubType <em>Stub Type</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.Stub#getIndex <em>Index</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.Stub#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.Stub#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.Stub#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.Stub#getStubRef <em>Stub Ref</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.Stub#getOutPaths <em>Out Paths</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.Stub#getConnectingStubBody <em>Connecting Stub Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.turn.turn.TurnPackage#getStub()
 * @model
 * @generated
 */
public interface Stub extends URNmodelElement, RegularEnd
{
  /**
   * Returns the value of the '<em><b>Stub Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stub Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stub Type</em>' attribute.
   * @see #setStubType(String)
   * @see org.xtext.project.turn.turn.TurnPackage#getStub_StubType()
   * @model
   * @generated
   */
  String getStubType();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.Stub#getStubType <em>Stub Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stub Type</em>' attribute.
   * @see #getStubType()
   * @generated
   */
  void setStubType(String value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see org.xtext.project.turn.turn.TurnPackage#getStub_Index()
   * @model
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.Stub#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

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
   * @see org.xtext.project.turn.turn.TurnPackage#getStub_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.Stub#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.project.turn.turn.TurnPackage#getStub_LongName()
   * @model containment="true"
   * @generated
   */
  LongName getLongName();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.Stub#getLongName <em>Long Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long Name</em>' containment reference.
   * @see #getLongName()
   * @generated
   */
  void setLongName(LongName value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(StubParameters)
   * @see org.xtext.project.turn.turn.TurnPackage#getStub_Params()
   * @model containment="true"
   * @generated
   */
  StubParameters getParams();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.Stub#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(StubParameters value);

  /**
   * Returns the value of the '<em><b>Stub Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stub Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stub Ref</em>' reference.
   * @see #setStubRef(StubDeclaration)
   * @see org.xtext.project.turn.turn.TurnPackage#getStub_StubRef()
   * @model
   * @generated
   */
  StubDeclaration getStubRef();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.Stub#getStubRef <em>Stub Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stub Ref</em>' reference.
   * @see #getStubRef()
   * @generated
   */
  void setStubRef(StubDeclaration value);

  /**
   * Returns the value of the '<em><b>Out Paths</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.turn.turn.StubOutPath}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Paths</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Paths</em>' containment reference list.
   * @see org.xtext.project.turn.turn.TurnPackage#getStub_OutPaths()
   * @model containment="true"
   * @generated
   */
  EList<StubOutPath> getOutPaths();

  /**
   * Returns the value of the '<em><b>Connecting Stub Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connecting Stub Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connecting Stub Body</em>' containment reference.
   * @see #setConnectingStubBody(PathBody)
   * @see org.xtext.project.turn.turn.TurnPackage#getStub_ConnectingStubBody()
   * @model containment="true"
   * @generated
   */
  PathBody getConnectingStubBody();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.Stub#getConnectingStubBody <em>Connecting Stub Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connecting Stub Body</em>' containment reference.
   * @see #getConnectingStubBody()
   * @generated
   */
  void setConnectingStubBody(PathBody value);

} // Stub
