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
          <h4 class="page-title">Meus Pacientes</h4>
          

          
          <div class="card ">
            <div class="card-header ">
              <div class="card-title col">Pacientes do HCM</div>
            </div>
            <div class="card-body ">
              <div class="table-responsive">
                <table class="table table-striped table-hover mt-3 table-head-bg-success">
                  <thead>
                    <tr>
                      <th scope="col">#</th>
                      <th scope="col">Nome</th>
                      <th scope="col">Idade</th>
                      <th scope="col">Género</th>
                      <th scope="col">Acções</th>
                      <th scope="col">Endereço</th>
                      <th scope="col">Contactos</th>
                      <th scope="col">Pais</th>
                      <th scope="col">Qtd Processos</th>
                      <th scope="col">Consultas agendadas</th>
                      <th scope="col">Data Criação</th>
                      <th scope="col">Última actualização</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>1</td>
                      <td>Mark</td>
                      <td>49</td>
                      <td>Masculino</td>
                      <td>
                        <button class="btn btn-info btn-round btn-xs ml-"> <i class="la la-file-text la-lg"></i> Detalhes</button>
                        <button class="btn btn-primary btn-round btn-xs ml-1"> <i class="la la-pencil la-lg"></i> Consulta</button>
                        <button class="btn btn-warning btn-round btn-xs ml-2">Relatório</button>
                      </td>
                      <td>dsfsdfsd </td>
                      <td>fsdfsd</td>
                      <td>@sdfbj jdf hf sdo</td>
                      <td>2</td>
                      <td> 3 </td>
                      <td>fsdfsd</td>
                      <td>@sdfbj jdf hf sdo</td>
                    </tr>
                  </tbody>
                </table>
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