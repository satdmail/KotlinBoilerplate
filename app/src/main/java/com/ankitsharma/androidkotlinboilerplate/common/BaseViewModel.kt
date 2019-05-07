package com.ankitsharma.androidkotlinboilerplate.common

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.ankitsharma.androidkotlinboilerplate.data.models.ErrorData
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by ankitsharma on 18/01/18.
 */
open class BaseViewModel: ViewModel() {

    val loader: MutableLiveData<Boolean> = MutableLiveData()
    val error: MutableLiveData<ErrorData?> = MutableLiveData()
    var compositeDisposable: CompositeDisposable = CompositeDisposable()

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}