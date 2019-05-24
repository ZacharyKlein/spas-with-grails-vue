<template>
    <div style="margin: 0 auto; width: 320px; text-align: center">
        <div class="title cell">
            <label>Username</label>
            <input v-model="username" type="text"/>
        </div>
        <div class="author cell">
            <label>Password</label>

            <input v-model="password" type="password"/>
        </div>
        <div class="save cell">
            <button @click="submit()">Login</button>
        </div>
    </div>
</template>
<script>
    export default {
        name: 'LoginForm',
        props: ['submitLogin'],
        data() {
            return {
                username: '',
                password: ''
            }
        },
        methods: {
            submit() {
                this.submitLogin(this.username, this.password)
            }
        }
    }
</script>
<style>

</style>