<template>
  <div class="cart-common-layer">
    КОРЗИНА
  </div>
</template>

<script>
  export default {
    data() {
      return {
        orderProducts: {}
      }
    },
    mounted() {
      (async () => {
        try {
          const response = await fetch("http://localhost:8080/cart/get_products", {
            method: "GET"
          });
          if (response.ok) {
            this.orderProducts = await response.json();
            console.log(this.orderProducts); // Вывод полученных данных
          } else {
            console.log("Ошибка при получении данных");
          }
        } catch (error) {
          console.log("Произошла ошибка:", error);
        }
      })();
    }
  }
</script>