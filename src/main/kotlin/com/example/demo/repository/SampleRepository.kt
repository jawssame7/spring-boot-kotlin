package com.example.demo.repository

import com.example.demo.entity.SampleEntity
import org.springframework.data.jpa.repository.JpaRepository


interface SampleRepository: JpaRepository<SampleEntity, Int>