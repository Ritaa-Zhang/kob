<template>
    <ContentField>
        user bot
    </ContentField>
</template>

<script>
import ContentField from '../../../components/ContentField.vue'
import $ from 'jquery'
import { useStore } from 'vuex';

export default {
    components: {
        ContentField
    },

    setup() {
        const store = useStore();

        // $.ajax({
        //     url: "http://127.0.0.1:8080/user/bot/add/",
        //     type: "post",
        //     data: {
        //         title: "bot's title",
        //         description: "bot's description",
        //         content: "bot's content",
        //     },
        //     headers: {
        //         Authorization: "Bearer " + store.state.user.token,
        //     },
        //     success(resp) {
        //         console.log(resp);
        //     },
        //     error(resp) {
        //         console.log(resp);
        //     }
        // })

        // $.ajax({
        //     url: "http://127.0.0.1:8080/user/bot/remove/",
        //     type: "post",
        //     data: {
        //         bot_id: 10,
        //     },
        //     headers: {
        //         Authorization: "Bearer " + store.state.user.token,
        //     },
        //     success(resp) {
        //         console.log(resp);
        //     },
        //     error(resp) {
        //         console.log(resp);
        //     }
        // })

        // $.ajax({
        //     url: "http://127.0.0.1:8080/user/bot/update/",
        //     type: "post",
        //     data: {
        //         bot_id: 9,
        //         title: "bot's title10",
        //         description: "bot's description10",
        //         content: "bot's content10",
        //     },
        //     headers: {
        //         Authorization: "Bearer " + store.state.user.token,
        //     },
        //     success(resp) {
        //         console.log(resp);
        //     },
        //     error(resp) {
        //         console.log(resp);
        //     }
        // })

        $.ajax({
            url: "http://127.0.0.1:8080/user/bot/getlist/",
            type: "get",
            headers: {
                Authorization: "Bearer " + store.state.user.token,
            },
            success(resp) {
                console.log(resp);
            },
            error(resp) {
                console.log(resp);
            }
        })
    }
}
</script>

<style scoped> 
</style>

