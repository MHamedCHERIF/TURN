/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.project.turn.turn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.project.turn.turn.ComponentBinding;
import org.xtext.project.turn.turn.ComponentRef;
import org.xtext.project.turn.turn.TurnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.impl.ComponentBindingImpl#getComponentIn <em>Component In</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ComponentBindingImpl#getComponentOut <em>Component Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentBindingImpl extends BindingImpl implements ComponentBinding
{
  /**
   * The cached value of the '{@link #getComponentIn() <em>Component In</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentIn()
   * @generated
   * @ordered
   */
  protected ComponentRef componentIn;

  /**
   * The cached value of the '{@link #getComponentOut() <em>Component Out</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentOut()
   * @generated
   * @ordered
   */
  protected ComponentRef componentOut;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentBindingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TurnPackage.Literals.COMPONENT_BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentRef getComponentIn()
  {
    if (componentIn != null && componentIn.eIsProxy())
    {
      InternalEObject oldComponentIn = (InternalEObject)componentIn;
      componentIn = (ComponentRef)eResolveProxy(oldComponentIn);
      if (componentIn != oldComponentIn)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TurnPackage.COMPONENT_BINDING__COMPONENT_IN, oldComponentIn, componentIn));
      }
    }
    return componentIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentRef basicGetComponentIn()
  {
    return componentIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentIn(ComponentRef newComponentIn)
  {
    ComponentRef oldComponentIn = componentIn;
    componentIn = newComponentIn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.COMPONENT_BINDING__COMPONENT_IN, oldComponentIn, componentIn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentRef getComponentOut()
  {
    if (componentOut != null && componentOut.eIsProxy())
    {
      InternalEObject oldComponentOut = (InternalEObject)componentOut;
      componentOut = (ComponentRef)eResolveProxy(oldComponentOut);
      if (componentOut != oldComponentOut)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TurnPackage.COMPONENT_BINDING__COMPONENT_OUT, oldComponentOut, componentOut));
      }
    }
    return componentOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentRef basicGetComponentOut()
  {
    return componentOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentOut(ComponentRef newComponentOut)
  {
    ComponentRef oldComponentOut = componentOut;
    componentOut = newComponentOut;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.COMPONENT_BINDING__COMPONENT_OUT, oldComponentOut, componentOut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TurnPackage.COMPONENT_BINDING__COMPONENT_IN:
        if (resolve) return getComponentIn();
        return basicGetComponentIn();
      case TurnPackage.COMPONENT_BINDING__COMPONENT_OUT:
        if (resolve) return getComponentOut();
        return basicGetComponentOut();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TurnPackage.COMPONENT_BINDING__COMPONENT_IN:
        setComponentIn((ComponentRef)newValue);
        return;
      case TurnPackage.COMPONENT_BINDING__COMPONENT_OUT:
        setComponentOut((ComponentRef)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TurnPackage.COMPONENT_BINDING__COMPONENT_IN:
        setComponentIn((ComponentRef)null);
        return;
      case TurnPackage.COMPONENT_BINDING__COMPONENT_OUT:
        setComponentOut((ComponentRef)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TurnPackage.COMPONENT_BINDING__COMPONENT_IN:
        return componentIn != null;
      case TurnPackage.COMPONENT_BINDING__COMPONENT_OUT:
        return componentOut != null;
    }
    return super.eIsSet(featureID);
  }

} //ComponentBindingImpl
