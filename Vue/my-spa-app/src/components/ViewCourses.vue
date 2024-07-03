<template>
<div class="container text-center">
    <div class="row">
        <div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Search Course</span>
  <input v-model="search" @change="handleChange" type="search" class="form-control" placeholder="Enter Course Name To Search" aria-label="Username" aria-describedby="basic-addon1">
</div>
    <Card v-for="course in courses" :title="course.title"></Card>
   </div>
   </div>
</template>
<script>
import axios from 'axios'
import CourseService from '../services/CourseService.js'
import Card from './Card.vue'
export default {
    components: {
        Card
    },
    data: function () {
        return {
            courses: [],
            search: ''
        }
       
    },
    methods: {
        handleChange(){
            console.log('Change event', this.search)
            let searchedCourses = this.courses.filter((c)=> c.title.startsWith(this.search))
            this.courses = searchedCourses
        },
        navigate(courseId){
            this.$router.push({ name: 'course', params: { id: courseId } })
        },
        deleteCourse(courseId){
            // axios.delete('http://localhost:3000/courses/'+ courseId)
            CourseService.deleteCourse(courseId)
            .then(res=> {
                console.log(res);
                console.log(res.status)
                this.message = "Course Deleted Successfully!"
                var leftOverCourses = this.courses.filter(c => c.id!=courseId);
                this.courses = leftOverCourses
            })
            // fetch('http://localhost:3000/courses/'+ courseId,
            //      {
            //         method: 'DELETE'
            //      }
            // )
            // .then(res => {
            //     console.log(res.status)
            //     this.message = "Course Deleted Successfully!"
            //     var leftOverCourses = this.courses.filter(c => c.id!=courseId);
            //     this.courses = leftOverCourses
            // })
        }
    },
    mounted() {
        console.log(`the component is now mounted.`)
        // fetch('http://localhost:3000/courses')
        //     .then(res => res.json())
        //     .then(data => {
        //         console.log(data)
        //         this.courses = data
        //     })
        // axios.get('http://localhost:3000/courses')
        // .then(res=> {
        //     console.log(res);
        //     this.courses = res.data
        // })
        CourseService.getCourses()
          .then(res=> {
            console.log(res);
            this.courses = res.data
        })
    }
}

</script>