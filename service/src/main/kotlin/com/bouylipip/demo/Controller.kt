package com.bouylipip.demo

import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class Controller(val discoveryClient: DiscoveryClient) {


    @GetMapping("hello")
    fun hello(): String = "hello"

    @GetMapping("services")
    fun services(): List<String> = discoveryClient.services

}