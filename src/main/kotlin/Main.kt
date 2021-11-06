// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import kotlinx.coroutines.*
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    DesktopMaterialTheme {
        Button(onClick = {
            text = "Hello, Desktop!"
        }) {
            Text(text)
        }
    }
}

fun main() = application {

    MainScope().launch {
        launch {  coroutines()}
    }
}

suspend fun coroutines() = coroutineScope {
    val w1 = launch {  foo1()}
    val w2 = launch {  foo2()}
    val w3 = launch {  foo3()}

//    val res1 = w1.await()
//    val res2 = w1.await()
//    val res3 = w1.await()

//    println(" response $res1")
//    println(" response $res2")
//    println(" response $res3")
}


suspend fun foo1() :Int {
    return suspendCoroutine {
        var res = 0
        for(i in 1..100) {
            println("foo1 - $i")
            res+=i
            Thread.sleep(400)
        }
        it.resume(res)
    }
}

suspend fun foo2() :Int {
    return suspendCoroutine {
        var res = 0
        for(i in 1..100) {
            println("foo2 - $i")
            res+=i
            Thread.sleep(400)
        }
        it.resume(res)
    }
}

suspend fun foo3() :Int {
    return suspendCoroutine {
        var res = 0
        for(i in 1..100) {
            println("foo3 - $i")
            res+=i
            Thread.sleep(400)
        }
        it.resume(res)
    }
}
