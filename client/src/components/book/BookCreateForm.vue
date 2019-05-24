<template>
  <div class="form" style="margin: 0px auto; width: 800px; text-align: center">
    <div class="title cell">
      <label>Title</label>
      <input v-model="book.title" type="text" ref="bookTitle"/>
    </div>
    <div class="author cell">
      <label>Author</label>

      <input v-model="book.author" type="text" ref="bookTitle"/>
    </div>
    <div class="save cell">
      <button @click="submitNewBook()">Add Book</button>
    </div>
  </div>
</template>

<script>
export default {
  name: 'BookCreateForm',
  props: ['addBook'],
  data () {
    return {
      book: {
        title: '',
        author: ''
      }
    }
  },
  methods: {
    submitNewBook () {
      this.addBook(this.book)
      this.resetForm()
    },
    resetForm() {
      this.book = {title: '', author: ''}
      this.$refs.bookTitle.focus()
    }
  }
}
</script>

<style scoped>

  .cell {
    width: 250px;
    float: left
  }

</style>
