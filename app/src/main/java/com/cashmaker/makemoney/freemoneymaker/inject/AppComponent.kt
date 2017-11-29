package com.cashmaker.makemoney.freemoneymaker.inject

import com.cashmaker.makemoney.freemoneymaker.core.MyApplication
import com.cashmaker.makemoney.freemoneymaker.core.services.ClaimService
import com.cashmaker.makemoney.freemoneymaker.screens.BaseActivity
import com.cashmaker.makemoney.freemoneymaker.screens.dialogs.*
import dagger.Component

@Component(modules = arrayOf(AppModule::class, MainModule::class))
interface AppComponent {

    fun inject(screen: BaseActivity)
    fun inject(app: MyApplication)
    fun inject(dialog: LoginDialog)
    fun inject(dialog: SignupDialog)
    fun inject(dialog: PromocodeDialog)
    fun inject(dialog: RedeemDialog)
    fun inject(service: ClaimService)
    fun inject(dialog: HistoryDialog)
}
