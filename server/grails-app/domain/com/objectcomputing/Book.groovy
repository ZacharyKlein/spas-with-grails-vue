package com.objectcomputing

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.Resource

@Secured('isAnonymous()')
@Resource
class Book {

    String title
    String author

    static constraints = {
        title blank: false
        author nullable: true
    }
}
