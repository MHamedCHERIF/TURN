/**
 * generated by Xtext 2.14.0
 */
package org.xtext.project.turn.turn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.project.turn.turn.ConcreteURNspec;
import org.xtext.project.turn.turn.TurnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete UR Nspec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.impl.ConcreteURNspecImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ConcreteURNspecImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ConcreteURNspecImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ConcreteURNspecImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ConcreteURNspecImpl#getSpecVersion <em>Spec Version</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ConcreteURNspecImpl#getUrnVersion <em>Urn Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteURNspecImpl extends MinimalEObjectImpl.Container implements ConcreteURNspec
{
  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected static final String AUTHOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected String author = AUTHOR_EDEFAULT;

  /**
   * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreated()
   * @generated
   * @ordered
   */
  protected static final String CREATED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreated()
   * @generated
   * @ordered
   */
  protected String created = CREATED_EDEFAULT;

  /**
   * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModified()
   * @generated
   * @ordered
   */
  protected static final String MODIFIED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModified()
   * @generated
   * @ordered
   */
  protected String modified = MODIFIED_EDEFAULT;

  /**
   * The default value of the '{@link #getSpecVersion() <em>Spec Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecVersion()
   * @generated
   * @ordered
   */
  protected static final String SPEC_VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSpecVersion() <em>Spec Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecVersion()
   * @generated
   * @ordered
   */
  protected String specVersion = SPEC_VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getUrnVersion() <em>Urn Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrnVersion()
   * @generated
   * @ordered
   */
  protected static final String URN_VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrnVersion() <em>Urn Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrnVersion()
   * @generated
   * @ordered
   */
  protected String urnVersion = URN_VERSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConcreteURNspecImpl()
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
    return TurnPackage.Literals.CONCRETE_UR_NSPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.CONCRETE_UR_NSPEC__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAuthor()
  {
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthor(String newAuthor)
  {
    String oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.CONCRETE_UR_NSPEC__AUTHOR, oldAuthor, author));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCreated()
  {
    return created;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreated(String newCreated)
  {
    String oldCreated = created;
    created = newCreated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.CONCRETE_UR_NSPEC__CREATED, oldCreated, created));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModified()
  {
    return modified;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModified(String newModified)
  {
    String oldModified = modified;
    modified = newModified;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.CONCRETE_UR_NSPEC__MODIFIED, oldModified, modified));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSpecVersion()
  {
    return specVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecVersion(String newSpecVersion)
  {
    String oldSpecVersion = specVersion;
    specVersion = newSpecVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.CONCRETE_UR_NSPEC__SPEC_VERSION, oldSpecVersion, specVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrnVersion()
  {
    return urnVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrnVersion(String newUrnVersion)
  {
    String oldUrnVersion = urnVersion;
    urnVersion = newUrnVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.CONCRETE_UR_NSPEC__URN_VERSION, oldUrnVersion, urnVersion));
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
      case TurnPackage.CONCRETE_UR_NSPEC__DESCRIPTION:
        return getDescription();
      case TurnPackage.CONCRETE_UR_NSPEC__AUTHOR:
        return getAuthor();
      case TurnPackage.CONCRETE_UR_NSPEC__CREATED:
        return getCreated();
      case TurnPackage.CONCRETE_UR_NSPEC__MODIFIED:
        return getModified();
      case TurnPackage.CONCRETE_UR_NSPEC__SPEC_VERSION:
        return getSpecVersion();
      case TurnPackage.CONCRETE_UR_NSPEC__URN_VERSION:
        return getUrnVersion();
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
      case TurnPackage.CONCRETE_UR_NSPEC__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case TurnPackage.CONCRETE_UR_NSPEC__AUTHOR:
        setAuthor((String)newValue);
        return;
      case TurnPackage.CONCRETE_UR_NSPEC__CREATED:
        setCreated((String)newValue);
        return;
      case TurnPackage.CONCRETE_UR_NSPEC__MODIFIED:
        setModified((String)newValue);
        return;
      case TurnPackage.CONCRETE_UR_NSPEC__SPEC_VERSION:
        setSpecVersion((String)newValue);
        return;
      case TurnPackage.CONCRETE_UR_NSPEC__URN_VERSION:
        setUrnVersion((String)newValue);
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
      case TurnPackage.CONCRETE_UR_NSPEC__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case TurnPackage.CONCRETE_UR_NSPEC__AUTHOR:
        setAuthor(AUTHOR_EDEFAULT);
        return;
      case TurnPackage.CONCRETE_UR_NSPEC__CREATED:
        setCreated(CREATED_EDEFAULT);
        return;
      case TurnPackage.CONCRETE_UR_NSPEC__MODIFIED:
        setModified(MODIFIED_EDEFAULT);
        return;
      case TurnPackage.CONCRETE_UR_NSPEC__SPEC_VERSION:
        setSpecVersion(SPEC_VERSION_EDEFAULT);
        return;
      case TurnPackage.CONCRETE_UR_NSPEC__URN_VERSION:
        setUrnVersion(URN_VERSION_EDEFAULT);
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
      case TurnPackage.CONCRETE_UR_NSPEC__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case TurnPackage.CONCRETE_UR_NSPEC__AUTHOR:
        return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
      case TurnPackage.CONCRETE_UR_NSPEC__CREATED:
        return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
      case TurnPackage.CONCRETE_UR_NSPEC__MODIFIED:
        return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
      case TurnPackage.CONCRETE_UR_NSPEC__SPEC_VERSION:
        return SPEC_VERSION_EDEFAULT == null ? specVersion != null : !SPEC_VERSION_EDEFAULT.equals(specVersion);
      case TurnPackage.CONCRETE_UR_NSPEC__URN_VERSION:
        return URN_VERSION_EDEFAULT == null ? urnVersion != null : !URN_VERSION_EDEFAULT.equals(urnVersion);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (description: ");
    result.append(description);
    result.append(", author: ");
    result.append(author);
    result.append(", created: ");
    result.append(created);
    result.append(", modified: ");
    result.append(modified);
    result.append(", specVersion: ");
    result.append(specVersion);
    result.append(", urnVersion: ");
    result.append(urnVersion);
    result.append(')');
    return result.toString();
  }

} //ConcreteURNspecImpl
