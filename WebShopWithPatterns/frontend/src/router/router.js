import {createRouter, createWebHistory} from "vue-router";
import MainPage from '@/views/MainPage.vue'
import CatalogPage from '@/views/CatalogPage.vue'
import CartPage from "@/views/CartPage.vue";

export default createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: "/start",
            name: 'MainPage',
            component: MainPage
        },
        {
            path: "/catalog",
            name: "CatalogPage",
            component: CatalogPage
        },
        {
            path: "/cart",
            name: "CartPage",
            component: CartPage
        }

    ]
})