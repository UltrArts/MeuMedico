<script>
  export default {
    name: 'PatientsComp',
    data() {
      return {
        items: [
            { id: 20230001, name: 'Edson Da Cruz', age: 2, gender: 'Masculino', address: 'Rua Vasco Firmino Q 12, casa 2341', contacts: '87903442, 824783443, 84781312', filiation: 'Maria de Rosário e Pedro Jamisse', processes: 7, appointments: 23, created_at: '23-10-23 12:45:39', updated_at:  '23-10-23 12:45:39'},
            { id: 20230002, name: 'Edson Da Cruz', age: 12, gender: 'Masculino', address: 'Rua Vasco Firmino Q 12, casa 2341', contacts: '87903442, 824783443, 84781312', filiation: 'Maria de Rosário e Pedro Jamisse', processes: 21, appointments: 23, created_at: '23-10-23 12:45:39', updated_at:  '23-10-23 12:45:39'},
            { id: 20230003, name: 'Edson Da Cruz', age: 20, gender: 'Masculino', address: 'Rua Vasco Firmino Q 12, casa 2341', contacts: '87903442, 824783443, 84781312', filiation: 'Maria de Rosário e Pedro Jamisse', processes: 5, appointments: 23, created_at: '23-10-23 12:45:39', updated_at:  '23-10-23 12:45:39'},
            { id: 20230004, name: 'Edson Da Cruz', age: 16, gender: 'Masculino', address: 'Rua Vasco Firmino Q 12, casa 2341', contacts: '87903442, 824783443, 84781312', filiation: 'Maria de Rosário e Pedro Jamisse', processes: 7, appointments: 23, created_at: '23-10-23 12:45:39', updated_at:  '23-10-23 12:45:39'},
            { id: 20230005, name: 'Edson Da Cruz', age: 87, gender: 'Masculino', address: 'Rua Vasco Firmino Q 12, casa 2341', contacts: '87903442, 824783443, 84781312', filiation: 'Maria de Rosário e Pedro Jamisse', processes: 7, appointments: 23, created_at: '23-10-23 12:45:39', updated_at:  '23-10-23 12:45:39'},
            { id: 20230006, name: 'Edson Da Cruz', age: 26, gender: 'Masculino', address: 'Rua Vasco Firmino Q 12, casa 2341', contacts: '87903442, 824783443, 84781312', filiation: 'Maria de Rosário e Pedro Jamisse', processes: 7, appointments: 23, created_at: '23-10-23 12:45:39', updated_at:  '23-10-23 12:45:39'},
            { id: 20230007, name: 'Edson Da Cruz', age: 42, gender: 'Masculino', address: 'Rua Vasco Firmino Q 12, casa 2341', contacts: '87903442, 824783443, 84781312', filiation: 'Maria de Rosário e Pedro Jamisse', processes: 7, appointments: 23, created_at: '23-10-23 12:45:39', updated_at:  '23-10-23 12:45:39'},
            { id: 20230008, name: 'Elísio Monjane', age: 2, gender: 'Masculino', address: 'Rua Vasco Firmino Q 12, casa 2341', contacts: '87903442, 824783443, 84781312', filiation: 'Maria de Rosário e Pedro Jamisse', processes: 7, appointments: 23, created_at: '23-10-23 12:45:39', updated_at:  '23-10-23 12:45:39'},
            { id: 20230009, name: 'Elísio Monjane', age: 2, gender: 'Masculino', address: 'Rua Vasco Firmino Q 12, casa 2341', contacts: '87903442, 824783443, 84781312', filiation: 'Maria de Rosário e Pedro Jamisse', processes: 7, appointments: 23, created_at: '23-10-23 12:45:39', updated_at:  '23-10-23 12:45:39'},
            { id: 20230010, name: 'Elísio Monjane', age: 2, gender: 'Masculino', address: 'Rua Vasco Firmino Q 12, casa 2341', contacts: '87903442, 824783443, 84781312', filiation: 'Maria de Rosário e Pedro Jamisse', processes: 7, appointments: 23, created_at: '23-10-23 12:45:39', updated_at:  '23-10-23 12:45:39'},
            { id: 20230011, name: 'Elísio Monjane', age: 2, gender: 'Masculino', address: 'Rua Vasco Firmino Q 12, casa 2341', contacts: '87903442, 824783443, 84781312', filiation: 'Maria de Rosário e Pedro Jamisse', processes: 7, appointments: 23, created_at: '23-10-23 12:45:39', updated_at:  '23-10-23 12:45:39'},
            { id: 20230012, name: 'Elísio Monjane', age: 2, gender: 'Masculino', address: 'Rua Vasco Firmino Q 12, casa 2341', contacts: '87903442, 824783443, 84781312', filiation: 'Maria de Rosário e Pedro Jamisse', processes: 7, appointments: 23, created_at: '23-10-23 12:45:39', updated_at:  '23-10-23 12:45:39'},
            { id: 20230013, name: 'Elísio Monjane', age: 2, gender: 'Masculino', address: 'Rua Vasco Firmino Q 12, casa 2341', contacts: '87903442, 824783443, 84781312', filiation: 'Maria de Rosário e Pedro Jamisse', processes: 7, appointments: 23, created_at: '23-10-23 12:45:39', updated_at:  '23-10-23 12:45:39'},
            { id: 20230014, name: 'Matilde Costa', age: 2, gender: 'Feminino', address: 'Rua Vasco Firmino Q 12, casa 2341', contacts: '87903442, 824783443, 84781312', filiation: 'Maria de Rosário e Pedro Jamisse', processes: 7, appointments: 23, created_at: '23-10-23 12:45:39', updated_at:  '23-10-23 12:45:39'},
            { id: 20230015, name: 'Matilde Costa', age: 2, gender: 'Feminino', address: 'Rua Vasco Firmino Q 12, casa 2341', contacts: '87903442, 824783443, 84781312', filiation: 'Maria de Rosário e Pedro Jamisse', processes: 7, appointments: 23, created_at: '23-10-23 12:45:39', updated_at:  '23-10-23 12:45:39'},
        ],
        selectedRow: -1,
      };
    },
      methods: {
        selectRow(index) {
            this.selectedRow = index;
            const selectedData = this.items[index];
            console.log(selectedData);
        },
        resetSelectedRow() {
            this.selectedRow = -1;
        },
      }
  };

  
  const tableContainer = document.getElementById('table-container');
  const fixedTable = document.getElementById('fixed-table');

  // tableContainer.addEventListener('scroll', () => {
  //   fixedTable.style.transform = `translate(0, ${tableContainer.scrollTop}px)`;
  // });


</script>

<style scoped>
    .no-wrap td,
  .no-wrap th {
    white-space: nowrap;
  }

  .table-max-height {
      max-height: 70vh; /* Defina a altura máxima desejada */
      overflow-y: auto;
      position: relative;
  }
  .table-fixed-header {
    width: 100%;
  }

    .table-fixed-header thead {
      position: sticky;
      top: 0;
      background-color: #fff; /* Cor de fundo do cabeçalho */
      z-index: 1; /* Garante que o cabeçalho esteja sobre o conteúdo */
    }

    .selected {
      background-color: #3498db; /* Cor de fundo da linha selecionada */
      color: #ff0303; /* Cor do texto na linha selecionada */
      cursor: pointer; /* Transforma o cursor em uma mão para indicar que a linha é clicável */
    }

    .table-striped tbody tr:nth-child(odd).selected {
      background-color: #3498db !important; /* Cor de fundo da linha selecionada em linhas ímpares */
    }


</style>




<template @keydown.esc="resetSelectedRow">

<div class="main-panel" >
      <div class="content">
        <div class="container-fluid">
          <h4 class="page-title">Meus Pacientes</h4>
          

          
          <div class="card ">
            <div class="card-header ">
              <div class="card-title col">Pacientes do HCM</div>
              <button class="btn btn-info btn-round btn-xs ml-"> <i class="la la-file-text la-lg"></i> Detalhes</button>
              <button class="btn btn-primary btn-round btn-xs ml-1"> <i class="la la-pencil la-lg"></i> Consulta</button>
              <button class="btn btn-danger btn-round btn-xs ml-5" @click="resetSelectedRow">Reset</button>
            </div>
            <div class="card-body ">
              <div id="table-max-height" class="table-responsive table-max-height">
                <table id="table" class="table table-striped no-wrap  table-hover mt-3 table-head-bg-success table-fixed-header">
                  <thead>
                    <tr>
                      <th scope="col">#</th>
                      <th scope="col">Nome</th>
                      <th scope="col">Idade</th>
                      <th scope="col">Género</th>
                      <th scope="col">Endereço</th>
                      <th scope="col">Contactos</th>
                      <th scope="col">Pais</th>
                      <th scope="col">Processos</th>
                      <th scope="col">Agendamentos</th>
                      <th scope="col">Criação</th>
                      <th scope="col">Última actualização</th>
                    </tr>
                  </thead>
                  <tbody>

                    <tr v-for="(item, index) in items" :key="index" @click="selectRow(index)" :class="{ 'selected': index === selectedRow }">
                      <td> {{ item.id }} </td>
                      <td>{{ item.name }}</td>
                      <td>{{ item.age }}</td>
                      <td>{{ item.gender }}</td>
                      <td> {{ item.address }} </td>
                      <td> {{ item.contacts }} </td>
                      <td> {{ item.filiation }} </td>
                      <td> {{ item.processes }} </td>
                      <td> {{ item.appointments }} </td>
                      <td>  {{ item.created_at }}</td>
                      <td>  {{ item.updated_at }}</td>
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