<template>
  <div class="cart-common-layer">
    <div class="order-label">
      <p class="order-label-text">Корзина</p>
    </div>
    <div class="order-details" v-if="orderProducts">
      <div class="card-group-layer">
        <div class="card-group" v-for="beer in Object.keys(orderProducts)" :key="beer">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">{{ beer }}: </h5>
              <div class="card-button-common">
                <p class="beer-quantity-text">{{ orderProducts[beer] }}</p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div class="order-layer">
    <div class="payment-variant">
      <p class="payment-variant-label">Выберите способ оплаты</p>
      <div class="payment-radio-block">

        <div class="radio-variant">
          <input type="radio" id="creditCard" name="paymentMethod" value="creditCard" v-model="selectedMethod">
          <label for="creditCard">Кредитная карта</label>
        </div>

        <div class="radio-variant">
          <input type="radio" id="payPal" name="paymentMethod" value="payPal" v-model="selectedMethod">
          <label for="payPal">PayPal</label>
        </div>

      </div>
    </div>
    <button class="btn btn-success" @click="makePayment()">Оплатить</button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      orderProducts: {},
      imgSrc: '',
      selectedMethod: null
    }
  },
  created() {
    (async () => {
      try {
        const response = await fetch("http://localhost:8080/cart/get_products", {
          method: "GET"
        });
        if (response.ok) {
          this.orderProducts = await response.json();
          console.log(Object.keys(this.orderProducts)); // Вывод полученных данных

        } else {
          console.log("Ошибка при получении данных");
        }
      } catch (error) {
        console.log("Произошла ошибка:", error);
      }
    })();
  },
  methods: {
    async makePayment() {
      this.orderProducts.paymentMethod = this.selectedMethod;

      await fetch("http://localhost:8080/order/make_payment", {
        method: "POST",
        body: JSON.stringify(this.orderProducts)
      })
    }
  },
  watch: {
    selectedMethod(newVal) {
      console.log('selected:' + newVal)
    }
  }
}
</script>

<style scoped>
.cart-common-layer {
  border: 3px solid black;
  border-radius: 30px;

  text-align: center;
  margin: 20px;
  padding: 20px;
}

.card {
  margin: 15px;

}
.card-body {
  display: flex;
  justify-content: center;
  text-align: center;
  font-size: 20px;
  padding: 5px;
}

.order-label {
  justify-content: center;
}

.order-label-text {
  font-size: 30px;
  border-bottom: 3px solid orangered;
  margin: 0 500px 20px 500px;
}

.order-layer {
  margin: 40px 0 10px 0;
  justify-content: center;
  text-align: center;
}
.beer-quantity-text {
  margin: 0 0 0 10px;
}

.payment-variant-label {
  font-size: 30px;
}

.payment-radio-block {
  display: flex;
  justify-content: center;
}

.radio-variant {
  margin: 10px;
}

.btn-success {
  margin: 20px 0 0 0;
}
</style>