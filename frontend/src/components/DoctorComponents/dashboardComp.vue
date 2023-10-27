<script>
  export default {
    name: 'Dashboard',
    data() {
      return {
        
      };
    },
  };
</script>




<template>

<div class="main-panel">
      <div class="content">
        <div class="container-fluid">
          <h4 class="page-title">Dashboard {{seletedItem}}</h4>
          <div class="row">
            <div class="col-md-3">
              <div class="card card-stats card-warning">
                <div class="card-body ">
                  <div class="row">
                    <div class="col-5">
                      <div class="icon-big text-center">
                        <i class="la la-calendar-day"></i>
                      </div>
                    </div>
                    <div class="col-7 d-flex align-items-center">
                      <div class="numbers">
                        <p class="card-category">Hoje</p>
                        <h4 class="card-title">1,294</h4> 
                        Consultas
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="card card-stats card-success">
                <div class="card-body ">
                  <div class="row">
                    <div class="col-5">
                      <div class="icon-big text-center">
                        <i class="la la-user-injured"></i>
                      </div>
                    </div>
                    <div class="col-7 d-flex align-items-center">
                      <div class="numbers">
                        <p class="card-category">Meus Pacientes</p>
                        <h4 class="card-title">1,345</h4>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="card card-stats card-danger">
                <div class="card-body">
                  <div class="row">
                    <div class="col-5">
                      <div class="icon-big text-center">
                        <i class="la la-folder"></i>
                      </div>
                    </div>
                    <div class="col-7 d-flex align-items-center">
                      <div class="numbers">
                        <p class="card-category">Meus Processos</p>
                        <h4 class="card-title">1303</h4>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="card card-stats card-primary">
                <div class="card-body ">
                  <div class="row">
                    <div class="col-5">
                      <div class="icon-big text-center">
                        <i class="la la-hospital-alt"></i>
                      </div>
                    </div>
                    <div class="col-7 d-flex align-items-center">
                      <div class="numbers">
                        <p class="card-category">Meus Hospitais</p>
                        <h4 class="card-title">5</h4>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
             <div class="col-md-3">
              <div class="card card-stats">
                <div class="card-body ">
                  <div class="row">
                    <div class="col-5">
                      <div class="icon-big text-center icon-warning">
                        <i class="la la-pie-chart text-warning"></i>
                      </div>
                    </div>
                    <div class="col-7 d-flex align-items-center">
                      <div class="numbers">
                        <p class="card-category">Number</p>
                        <h4 class="card-title">150GB</h4>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="card card-stats">
                <div class="card-body ">
                  <div class="row">
                    <div class="col-5">
                      <div class="icon-big text-center">
                        <i class="la la-bar-chart text-success"></i>
                      </div>
                    </div>
                    <div class="col-7 d-flex align-items-center">
                      <div class="numbers">
                        <p class="card-category">Revenue</p>
                        <h4 class="card-title">$ 1,345</h4>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="card card-stats">
                <div class="card-body">
                  <div class="row">
                    <div class="col-5">
                      <div class="icon-big text-center">
                        <i class="la la-times-circle-o text-danger"></i>
                      </div>
                    </div>
                    <div class="col-7 d-flex align-items-center">
                      <div class="numbers">
                        <p class="card-category">Errors</p>
                        <h4 class="card-title">23</h4>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="card card-stats">
                <div class="card-body">
                  <div class="row">
                    <div class="col-5">
                      <div class="icon-big text-center">
                        <i class="la la-heart-o text-primary"></i>
                      </div>
                    </div>
                    <div class="col-7 d-flex align-items-center">
                      <div class="numbers">
                        <p class="card-category">Followers</p>
                        <h4 class="card-title">+45K</h4>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      
      <footer class="footer">
        <div class="container-fluid">
          <nav class="pull-left">
            <ul class="nav">
              <li class="nav-item">
                <a class="nav-link" href="http://www.themekita.com/">
                  ThemeKita
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  Help
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="https://themewagon.com/license/#free-item">
                  Licenses
                </a>
              </li>
            </ul>
          </nav>
          <div class="copyright ml-auto">
            2018, made with <i class="la la-heart heart text-danger"></i> by <a href="http://www.themekita.com/">ThemeKita</a>
          </div>				
        </div>
      </footer>
    </div>
  


</template>