package com.hachimi.demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform