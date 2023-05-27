<template>
  <div class="common-bucket">
    <div class="cart-label">
      <p class="cart-label-text">Каталог</p>
    </div>
  </div>

  <div class="card-group-layer">
    <div class="card-group">
      <div class="card">
        <img src="@/assets/pictures/beer1.jpeg" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">Miller</h5>
          <p class="card-text label">Абсолютный дефолт. Тот же "Bud" только дороже в 1.5 раза.</p>
          <p class="card-text label-price">100 руб.</p>
          <div class="card-button-common">
            <button type="button" class="btn btn-warning" @click="buyBeer('miller')">
              В корзину
            </button>
            <p class="beer-quantity-text" v-if="order['miller']">{{ order['miller'] }}</p>
          </div>
        </div>
      </div>
      <div class="card">
        <img src="@/assets/pictures/beer2.jpg" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">Bud</h5>
          <p class="card-text">Бывает в руках ценителей, находящихся в разных финансовых классах. Классика.</p>
          <p class="card-text label-price">75 руб.</p>
          <div class="card-button-common">
            <button type="button" class="btn btn-warning" @click="buyBeer('bud')">
              В корзину
            </button>
            <p class="beer-quantity-text" v-if="order['bud']">{{ order['bud'] }}</p>
          </div>
        </div>
      </div>
      <div class="card">
        <img src="@/assets/pictures/beer3.jpg" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">Card title</h5>
          <p class="card-text">Смена на заводе пройдет гораздо лайтовее, если вылить это зелье в общую кастрюлю.</p>
          <p class="card-text label-price">50 руб.</p>
          <div class="card-button-common">
            <button type="button" class="btn btn-warning" @click="buyBeer('zhigulevskoe')">
              В корзину
            </button>
            <p class="beer-quantity-text" v-if="order['zhigulevskoe']">{{ order['zhigulevskoe'] }}</p>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="cart-button-layer">
    <a href="/cart" class="btn btn-success" type="submit" @click="cartClickEvent()"
            v-if="order.miller || order.bud || order.zhigulevskoe">
      Перейти в корзину
    </a>
  </div>
</template>

<script>
export default {
  data() {
    return {
      order: {
        'miller': 0,
        'bud': 0,
        'zhigulevskoe': 0
      }
    }
  },

  methods: {
    buyBeer(beerName) {
      switch (beerName) {
        case 'miller':
          this.order['miller']++;
          break;
        case 'bud':
          this.order['bud']++;
          break;
        case 'zhigulevskoe':
          this.order['zhigulevskoe']++;
          break;
      }
    },
    async cartClickEvent() {
      await fetch("http://localhost:8080/cart/add_products", {
        method: "POST",
        body: JSON.stringify(this.order)
      })
    }
  }
}
</script>

<style scoped>
.card-group-layer {
  margin: 20px;
  padding: 30px;
}

.card {
  text-align: center;
}

.common-bucket {
  text-align: center;
}

.cart-label {
  font-size: 34px;
  margin-top: 10px;
  width: 100%;
  text-align: center;
  position: relative;
}

.cart-label-text {
  border-bottom: 4px solid orangered;
  padding: 20px;
  margin: 0 50px 0 50px;
}

.card-img-top {
  width: 250px;
  height: 260px;
  left: 50%;
  margin: 10px 0 0 110px;
}

.card-title {
  text-align: center;
}

.label-price {
  font-size: 20px;
  font-weight: bold;
  margin: 10px;
}

.card-button-common {
  justify-content: center;
}

.beer-quantity-text {
  left: 70px;
}

.cart-button-layer {
  margin: 10px 0 30px 0;
  justify-content: center;
  display: flex;
}

</style>