<template>
    <form @submit.prevent="submit()" style="margin: 0 auto; width: 320px; text-align: center">
        <div class="title cell">
            <label>Username</label>
            <input v-model="username" type="text"/>
        </div>
        <div class="author cell">
            <label>Password</label>

            <input v-model="password" type="password"/>
        </div>
        <div class="save cell">
            <input type="submit" value="Login" />
        </div>
    </form>
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