from django.http import HttpResponse

def home(request):
    return HttpResponse("<h1>Opa professor, sou Carlos Neto da turma SO 2025.2</h1>")