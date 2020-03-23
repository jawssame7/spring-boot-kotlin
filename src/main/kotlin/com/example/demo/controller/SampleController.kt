package com.example.demo.controller

import com.example.demo.entity.SampleEntity
import com.example.demo.service.SampleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class SampleController {

    @Autowired
    private lateinit var service: SampleService

    @GetMapping("/sample")
    fun sample(): String {
        return "aaaaaaaaaaa"
    }

    @GetMapping("/sample/samplelist")
    fun sampleList(): ResponseEntity<List<String>> {
        val list = listOf<String>("Hoge", "Huga")

        return ResponseEntity(list, HttpStatus.OK)
    }

    @GetMapping("/sample/list")
    fun list(): ResponseEntity<List<SampleEntity>> {
        return ResponseEntity(service.findAll(), HttpStatus.OK)
    }
}