<script>
  export default {
    name: 'AppointmentComp',
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
          <h4 class="page-title">Consultas</h4>
          <div class="card">

            <div class="card-header ">
              <div class="card-title col">Pacientes do HCM</div>
              <button class="btn btn-primary btn-round btn-xs"> <i class="la la-file-medical la-lg"></i> Nova Consulta</button>
              <button class="btn btn-secondary btn-round btn-xs ml-1"> <i class="la la-file-text la-lg"></i> Lista de Consultas</button>
              <button class="btn btn-danger btn-round btn-xs ml-5" @click="resetSelectedRow">Reset</button>
            </div>

            <div class="card-body">
              
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