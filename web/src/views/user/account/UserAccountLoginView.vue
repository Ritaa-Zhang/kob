<template>
    <ContentField v-if="!$store.state.user.pulling_info">
        <div class="row justify-content-md-center">
            <div class="col-3">
                <form @submit.prevent="login">
                    <div class="mb-3">
                        <label for="username" class="form-label">Username</label>
                        <input v-model="username" type="text" class="form-control" id="username" placeholder="please enter a username">
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label">Password</label>
                        <input v-model="password" type="password" class="form-control" id="password" placeholder="please enter the password">
                    </div>
                    <div class="error-message">{{ error_message }}</div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>
        </div>
    </ContentField>
</template>

<script>
import ContentField from '../../../components/ContentField.vue'
import { useStore } from 'vuex';
import { ref } from 'vue';
import router from '../../../router/index';

export default {
    components: {
        ContentField
    },

    setup() {
        const store = useStore();
        let username = ref('');
        let password = ref('');
        let error_message = ref('');

        const jwt_token = localStorage.getItem("jwt_token");
        console.log(store.state.user.pulling_info)
        if (jwt_token) {
            store.commit("updateToken", jwt_token);
            store.dispatch("getinfo", {
                success() {
                    router.push({name: "home"});
                    store.commit("updatePullingInfo", false);
                },
                error() {
                    store.commit("updatePullingInfo", false);
                }
            })
        } else {
            store.commit("updatePullingInfo", false);
        }

        const login = () => {
            console.log("点击submit了")
            error_message.value = "";
            store.dispatch("login", {
                username: username.value,
                password: password.value,
                success(resp) {
                    console.log(resp)
                    store.dispatch("getinfo", {
                        success() {
                            router.push({name: 'home'});
                        }
                    })
                },
                error() {
                    error_message.value = "Incorrect username or password";
                }
            })
        }
        return {
            username,
            password,
            error_message,
            login,
        }
    }
}
</script>

<style scoped> 
button {
    width: 100%;
}
div.error-message {
    color: red;
}
</style>