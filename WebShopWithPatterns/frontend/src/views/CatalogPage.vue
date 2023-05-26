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
            <button type="button" class="btn btn-warning">
              В корзину
            </button>
          </div>
        </div>
      </div>
      <div class="card">
        <img src="@/assets/pictures/beer2.jpg" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">Bud</h5>
          <p class="card-text">Бывает в руках ценителей, находящихся в разных финансовых сословиях. Классика.</p>
          <p class="card-text label-price">75 руб.</p>
          <button type="button" class="btn btn-warning">
            В корзину
          </button>
        </div>
      </div>
      <div class="card">
        <img src="@/assets/pictures/beer3.jpg" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">Card title</h5>
          <p class="card-text">Смена на заводе пройдет гораздо лайтовее, если вылить это зелье в общую кастрюлю.</p>
          <p class="card-text label-price">50 руб.</p>
          <button type="button" class="btn btn-warning">
            В корзину
          </button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>

</script>

<style>
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
  border-bottom: 2px solid orangered;
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


</style>