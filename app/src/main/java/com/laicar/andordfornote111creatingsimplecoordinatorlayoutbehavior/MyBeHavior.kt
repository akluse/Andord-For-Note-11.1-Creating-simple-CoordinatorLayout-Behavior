package com.laicar.andordfornote111creatingsimplecoordinatorlayoutbehavior

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.util.AttributeSet
import android.view.View

class MyBeHavior<V : View>: CoordinatorLayout.Behavior<V>{
    constructor():super()
    constructor(context:Context,attrs:AttributeSet):super(context,attrs)
}