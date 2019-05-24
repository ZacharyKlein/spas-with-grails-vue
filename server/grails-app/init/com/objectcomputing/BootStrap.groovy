package com.objectcomputing

class BootStrap {

    def init = { servletContext ->
        println "Creating user..."

        User.withTransaction {
            User user = new User(username: "user", password: "testing").save()
            Role role = new Role(authority: "ROLE_USER").save()
            UserRole.create(user, role, true)
        }
    }
    def destroy = {
    }
}
