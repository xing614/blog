<template>
    <div>
        <h3>所有注册用户</h3>
        <ul>
            <li v-for="item in list">
                {{item.username}}
            </li>
        </ul>
    </div>
</template>

<style>
    ul{padding: 0;}
    ul li{list-style: none;}
</style>

<script>
    export default{
        data(){
            return{
                list: ''
            }
        },
        mounted(){
        }
    }
</script>
