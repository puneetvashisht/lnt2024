<template>
    <table border="1">
        <tr v-for="course in courses">
            <td>{{ course.title }}</td>
            <td>{{ course.price }}</td>
        </tr>
    </table>
  </template>
  
  <script>
  export default {
    data: function () {
      return { courses: [ ] 
        
      };
    //     {id: 2, title: "Test1", price: 34343},
    //     {id: 22, title: "Test3", price: 44343},
     
    },
    mounted() {
    // console.log(`the component is now mounted.`)
    fetch('http://localhost:5000/courses')
            .then(res => res.json())
            .then(data => this.courses = data)
    }
  };
  </script>