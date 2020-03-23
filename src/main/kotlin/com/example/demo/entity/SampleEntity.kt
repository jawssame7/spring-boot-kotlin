package com.example.demo.entity

import javax.persistence.*

@Entity
@Table(name= "sample")
class SampleEntity {
    @Id
    var id: Int = 0
    @Column(name = "family_name")
    var familyName = String()
    @Column(name = "last_name")
    var lastName = String()
    var age: Int = 0
    var sex = String()
}