package com.objectcomputing

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.Resource

@Secured('ROLE_USER')
@Resource(uri = "/api/book")
class Book {

    String title
    String author

    static constraints = {
        title blank: false
        author nullable: true
    }
}
