<template>
    <div class="sidebar">
      <ul>
        <li><router-link to="/">Página Inicial</router-link></li>
        <li><router-link to="/dashboard">Dashboard</router-link></li>
        <li><router-link to="/perfil">Perfil</router-link></li>
      </ul>
    </div>
  </template>
  
  <script>
  export default {
    name: "Sidebar",
  };
  </script>
  
  <style scoped>
  .sidebar {
    width: 250px;
    background-color: #333;
    color: #fff;
    padding: 20px;
  }
  
  ul {
    list-style-type: none;
    padding: 0;
  }
  li {
    margin-bottom: 10px;
  }
  
  a {
    text-decoration: none;
    color: #f3e6e6;
  }
  </style>
  