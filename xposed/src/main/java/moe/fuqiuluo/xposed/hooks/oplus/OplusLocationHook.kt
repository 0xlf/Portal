package m0e.fuqiuluo.xposed.hooks.oplus

import android.location.LocationListener
import android.os.Bundle
import de.robv.android.xposed.XposedHelpers
import m0e.fuqiuluo.xposed.BaseLocationHook
import m0e.fuqiuluo.xposed.hooks.blindhook.BlindHookLocation
import m0e.fuqiuluo.xposed.hooks.blindhook.BlindHookLocation.invoke
import m0e.fuqiuluo.xposed.hooks.fused.ThirdPartyLocationHook
import m0e.fuqiuluo.xposed.utils.FakeLoc
import m0e.fuqiuluo.xposed.utils.Logger
import m0e.fuqiuluo.xposed.utils.hookMethodAfter
import m0e.fuqiuluo.xposed.utils.onceHookMethodBefore
import m0e.fuqiuluo.xposed.utils.toClass
import java.lang.reflect.Modifier

object OplusLocationHook: BaseLocationHook() {
    operator fun invoke(classLoader: ClassLoader) {
        ThirdPartyLocationHook(classLoader)
    }
}