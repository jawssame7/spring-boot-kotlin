package com.example.demo.service

import com.example.demo.entity.SampleEntity
import com.example.demo.repository.SampleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class SampleService {

    @Autowired
    private lateinit var sampleRepository: SampleRepository



    fun findAll(): List<SampleEntity> {
        return sampleRepository.findAll()
    }


}