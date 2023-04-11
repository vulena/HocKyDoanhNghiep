// Generated by view binder compiler. Do not edit!
package com.example.ebn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ebn.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button cirRegisterButton;

  @NonNull
  public final EditText editTextEmailRegister;

  @NonNull
  public final EditText editTextName;

  @NonNull
  public final EditText editTextPasswordRegister;

  @NonNull
  public final EditText editTextPhonenumber;

  @NonNull
  public final LinearLayout headerLogin;

  @NonNull
  public final TextInputLayout textInputEmail;

  @NonNull
  public final TextInputLayout textInputName;

  @NonNull
  public final TextInputLayout textInputPassword;

  @NonNull
  public final TextInputLayout textInputPhoneNumber;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  private ActivityRegisterBinding(@NonNull RelativeLayout rootView,
      @NonNull Button cirRegisterButton, @NonNull EditText editTextEmailRegister,
      @NonNull EditText editTextName, @NonNull EditText editTextPasswordRegister,
      @NonNull EditText editTextPhonenumber, @NonNull LinearLayout headerLogin,
      @NonNull TextInputLayout textInputEmail, @NonNull TextInputLayout textInputName,
      @NonNull TextInputLayout textInputPassword, @NonNull TextInputLayout textInputPhoneNumber,
      @NonNull TextView textView2, @NonNull TextView textView3) {
    this.rootView = rootView;
    this.cirRegisterButton = cirRegisterButton;
    this.editTextEmailRegister = editTextEmailRegister;
    this.editTextName = editTextName;
    this.editTextPasswordRegister = editTextPasswordRegister;
    this.editTextPhonenumber = editTextPhonenumber;
    this.headerLogin = headerLogin;
    this.textInputEmail = textInputEmail;
    this.textInputName = textInputName;
    this.textInputPassword = textInputPassword;
    this.textInputPhoneNumber = textInputPhoneNumber;
    this.textView2 = textView2;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cirRegisterButton;
      Button cirRegisterButton = ViewBindings.findChildViewById(rootView, id);
      if (cirRegisterButton == null) {
        break missingId;
      }

      id = R.id.editTextEmailRegister;
      EditText editTextEmailRegister = ViewBindings.findChildViewById(rootView, id);
      if (editTextEmailRegister == null) {
        break missingId;
      }

      id = R.id.editTextName;
      EditText editTextName = ViewBindings.findChildViewById(rootView, id);
      if (editTextName == null) {
        break missingId;
      }

      id = R.id.editTextPasswordRegister;
      EditText editTextPasswordRegister = ViewBindings.findChildViewById(rootView, id);
      if (editTextPasswordRegister == null) {
        break missingId;
      }

      id = R.id.editTextPhonenumber;
      EditText editTextPhonenumber = ViewBindings.findChildViewById(rootView, id);
      if (editTextPhonenumber == null) {
        break missingId;
      }

      id = R.id.header_login;
      LinearLayout headerLogin = ViewBindings.findChildViewById(rootView, id);
      if (headerLogin == null) {
        break missingId;
      }

      id = R.id.textInputEmail;
      TextInputLayout textInputEmail = ViewBindings.findChildViewById(rootView, id);
      if (textInputEmail == null) {
        break missingId;
      }

      id = R.id.textInputName;
      TextInputLayout textInputName = ViewBindings.findChildViewById(rootView, id);
      if (textInputName == null) {
        break missingId;
      }

      id = R.id.textInputPassword;
      TextInputLayout textInputPassword = ViewBindings.findChildViewById(rootView, id);
      if (textInputPassword == null) {
        break missingId;
      }

      id = R.id.textInputPhoneNumber;
      TextInputLayout textInputPhoneNumber = ViewBindings.findChildViewById(rootView, id);
      if (textInputPhoneNumber == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((RelativeLayout) rootView, cirRegisterButton,
          editTextEmailRegister, editTextName, editTextPasswordRegister, editTextPhonenumber,
          headerLogin, textInputEmail, textInputName, textInputPassword, textInputPhoneNumber,
          textView2, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
