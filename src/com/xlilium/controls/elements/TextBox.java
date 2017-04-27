package com.xlilium.controls.elements;

import com.xlilium.controls.internals.Control;

public interface TextBox extends Control{
    void EnterText(String text);
    String GetTextValue();
}
